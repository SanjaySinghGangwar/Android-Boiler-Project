package dev.sanjaygangwar.tempproject.workers.notifications

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import dev.sanjaygangwar.tempproject.utils.ToastUtil.mLog

class DummyWorkerTask(private val context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {
    override fun doWork(): Result {
        mLog("DUMMY WORKER IS RUNNING")
        return Result.success()
    }

}