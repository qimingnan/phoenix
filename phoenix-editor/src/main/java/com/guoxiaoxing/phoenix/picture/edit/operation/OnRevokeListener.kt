package com.guoxiaoxing.phoenix.picture.edit.operation

/**
 * ## Undo callback
 *
 * Created by lxw
 */
interface OnRevokeListener {

    fun revoke(operation: Operation)
}