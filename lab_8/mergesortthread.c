#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#define MAX 20
#define THREAD_MAX 4

int a[MAX];

void merge(int low, int mid, int high) {
    int left[mid - low + 1];
    int right[high - mid];
    int n1 = mid - low + 1, n2 = high - mid;
    int i, j, k;

    for (i = 0; i < n1; i++)
        left[i] = a[i + low];
    for (i = 0; i < n2; i++)
        right[i] = a[i + mid + 1];

    k = low;
    i = j = 0;
    while (i < n1 && j < n2) {
        if (left[i] <= right[j])
            a[k++] = left[i++];
        else
            a[k++] = right[j++];
    }

    while (i < n1)
        a[k++] = left[i++];
    while (j < n2)
        a[k++] = right[j++];
}

void* merge_sort(void* arg) {
    int thread_part = *(int*)arg;
    int low = thread_part * (MAX / 4);
    int high = (thread_part + 1) * (MAX / 4) - 1;
    int mid = low + (high - low) / 2;

    if (low < high) {
        merge_sort(&low);
        merge_sort(&mid);
        merge(low, mid, high);
    }
    return NULL;
}

int main() {
    for (int i = 0; i < MAX; i++)
        a[i] = rand() % 100;

    pthread_t threads[THREAD_MAX];
    for (int i = 0; i < THREAD_MAX; i++)
        pthread_create(&threads[i], NULL, merge_sort, &i);

    for (int i = 0; i < THREAD_MAX; i++)
        pthread_join(threads[i], NULL);

    merge(0, (MAX / 2 - 1) / 2, MAX / 2 - 1);
    merge(MAX / 2, MAX / 2 + (MAX - 1 - MAX / 2) / 2, MAX - 1);
    merge(0, (MAX - 1) / 2, MAX - 1);

    printf("Sorted array: ");
    for (int i = 0; i < MAX; i++)
        printf("%d ", a[i]);
    printf("\n");

    return 0;
}
