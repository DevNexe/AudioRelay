package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzbyq;

/* JADX INFO: loaded from: classes.dex */
public class OfflinePingSender extends Worker {
    public final zzbyq C;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.C = zzaw.zza().zzl(context, new zzbvc());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.QnHx doWork() {
        try {
            this.C.zzf();
            return new ListenableWorker.QnHx.F1();
        } catch (RemoteException unused) {
            return new ListenableWorker.QnHx.C0031QnHx();
        }
    }
}
