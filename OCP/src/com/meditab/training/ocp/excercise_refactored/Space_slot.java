public class SPACE_SLOT extends ResourceAllocator{

	private static final int INVALID_RESOURCE_ID = -1;
	int resourceId;
    private void markSpaceSlotFree(int resourceId)
    {
    }
	private void markSpaceSlotBusy(int resourceId)
    {
    }
	private int findFreeSpaceSlot()
    {
        return 0;
    }
	
	
	for (ResourceType type : types) {
            resourceId=allocate(ResourceType resourceType);
			free(ResourceType resourceType, int resourceId);
        }
	
	public int allocate(ResourceType resourceType)
    {
			resourceId = ts.findFreeTimeSlot();
            markTimeSlotBusy(resourceId);
			return resourceId;
	}
	
	public void free(ResourceType resourceType, int resourceId)
	{
		markTimeSlotFree(resourceId);
	}
}