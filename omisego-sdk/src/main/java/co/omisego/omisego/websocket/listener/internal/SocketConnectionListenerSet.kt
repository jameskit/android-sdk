package co.omisego.omisego.websocket.listener.internal

/**
 * OmiseGO
 *
 * Created by Yannick Badoual on 7/13/2018 AD.
 * Copyright © 2017-2018 OmiseGO. All rights reserved.
 */

import co.omisego.omisego.websocket.listener.SocketConnectionListener

interface SocketConnectionListenerSet {
    /**
     * Add listener for subscribing to the [SocketConnectionListener] event.
     *
     * @param connectionListener The [SocketConnectionListener] to be invoked when the channel has been joined, left, or got an error.
     * @see SocketConnectionListener for the event detail.
     */
    fun addConnectionListener(connectionListener: SocketConnectionListener)

    /**
     * Remove the listener for unsubscribing from the [SocketConnectionListener] event.
     *
     * @param connectionListener The [SocketConnectionListener] to be invoked when the channel has been joined, left, or got an error.
     * @see SocketConnectionListener for the event detail.
     */
    fun removeConnectionListener(connectionListener: SocketConnectionListener)
}
