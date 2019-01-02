package com.meditab.training.ocp.exercise;

public abstract class ResourceAllocator
{
 	
	abstract public int allocate(ResourceType resourceType);
    abstract public void free(ResourceType resourceType, int resourceId);
   
}
