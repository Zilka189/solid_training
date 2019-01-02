public class TIME_SLOT extends  ResourceAllocator
{
	
	private static final int INVALID_RESOURCE_ID = -1;
	int resourceId;
    private void markTimeSlotFree(int resourceId)
    {
    }
	private void markTimeSlotBusy(int resourceId)
    {
    }
	private int findFreeTimeSlot()
    {
        return 0;
    }
	
	for (ResourceType type : types) {
            resourceId=allocate(ResourceType resourceType);
			free(ResourceType resourceType, int resourceId);
        }
	
	public int allocate(ResourceType resourceType)
    {
			resourceId = findFreeTimeSlot();
            markTimeSlotBusy(resourceId);
			return resourceId;
	}
	
	public void free(ResourceType resourceType, int resourceId)
	{
		markTimeSlotFree(resourceId);
	}
	
}