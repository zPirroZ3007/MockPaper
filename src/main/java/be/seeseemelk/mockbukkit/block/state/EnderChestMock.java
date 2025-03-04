package be.seeseemelk.mockbukkit.block.state;

import be.seeseemelk.mockbukkit.UnimplementedOperationException;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.EnderChest;
import org.jetbrains.annotations.NotNull;

/**
 * A simple mock of the {@link EnderChest} {@link BlockState}, it is a pretty generic implementation of
 * {@link TileStateMock}.
 *
 * @author TheBusyBiscuit
 *
 */
public class EnderChestMock extends TileStateMock implements EnderChest
{

	public EnderChestMock(@NotNull Material material)
	{
		super(material);
	}

	protected EnderChestMock(@NotNull Block block)
	{
		super(block);
	}

	protected EnderChestMock(@NotNull EnderChestMock state)
	{
		super(state);
	}

	@Override
	public BlockState getSnapshot()
	{
		return new EnderChestMock(this);
	}

	@Override
	public void open()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void close()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isOpen()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}
}
