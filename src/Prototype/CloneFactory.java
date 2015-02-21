package Prototype;

class CloneFactory {
	public Animal getClone(Animal sample)
	{
		return sample.makeCopy();
	}
}
