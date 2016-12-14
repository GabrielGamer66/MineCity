package br.com.gamemods.minecity.reactive.game.item.data;

import java.util.Optional;

/**
 * A raw item without any property
 */
public interface ItemData
{
    Optional<String> getItemIdName();
    Optional<Integer> getItemId();
    Object getItem();

    default boolean matches(Object data)
    {
        //TODO Implement
        return false;
    }
}
