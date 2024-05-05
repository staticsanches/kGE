@file:Suppress("unused")

package dev.staticsanches.kge.utils

/**
 * Invoke the informed [action] for every element,collecting
 * eventual errors to be thrown at the end of the process.
 */
inline fun <T> invokeForAll(vararg targets: T, action: (T) -> Unit): Unit =
	targets.iterator().invokeForAll(action)

/**
 * Invoke the informed [action] for every element,collecting
 * eventual errors to be thrown at the end of the process.
 */
inline fun <T> Iterable<T>.invokeForAll(action: (T) -> Unit): Unit =
	iterator().invokeForAll(action)

/**
 * Invoke the informed [action] for every element,collecting
 * eventual errors to be thrown at the end of the process.
 */
inline fun <T> Sequence<T>.invokeForAll(action: (T) -> Unit): Unit =
	iterator().invokeForAll(action)

/**
 * Invoke the informed [action] for every element,collecting
 * eventual errors to be thrown at the end of the process.
 */
inline fun <T> Iterator<T>.invokeForAll(action: (T) -> Unit) {
	var error: Throwable? = null
	for (element in this) {
		try {
			action(element)
		} catch (t: Throwable) {
			if (error == null) {
				error = t
			} else {
				error.addSuppressed(t)
			}
		}
	}
	if (error != null) {
		throw error
	}
}
