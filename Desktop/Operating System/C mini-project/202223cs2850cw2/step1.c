struct node
{
    int i;
    struct node *next;
    struct node *prev;
};

struct list
{
    struct node *head;
    struct node *tail;
    struct node *right;
    struct node *left;
    int length;
};

void *allocator(int size, int *counter)
{
    void *p = malloc(size);
    if (p)
    {
        (*counter)++;
    }
    return p;
}

void deAllocator(void *p, int *counter)
{
    if (p)
    {
        free(p);
        (*counter)--;
    }
}

void initialiseList(struct list *pList, int *counter)
{
    pList->head = allocator(sizeof(struct node), counter);
    pList->tail = allocator(sizeof(struct node), counter);
    pList->head->next = pList->tail;
    pList->tail->prev = pList->head;
    pList->head->prev = NULL;
    pList->tail->next = NULL;
    pList->head->i = 0;
    pList->tail->i = 0;
    pList->left = pList->head;
    pList->right = pList->tail;
    pList->length = 0;
}

void freeList(struct list *pList, int *counter)
{
    if (pList->left == pList->head && pList->right == pList->tail && pList->length == 0)
    {
        deAllocator(pList->head, counter);
        deAllocator(pList->tail, counter);
        pList->head = NULL;
        pList->left = NULL;
        pList->tail = NULL;
        pList->right = NULL;
        pList->length = -1;
    }
}

int main()
{
    int counter = 0;
    struct list myList;
    initialiseList(&myList, &counter);
    printList(&myList, &counter);
    freeList(&myList, &counter);
    printList(&myList, &counter);
}