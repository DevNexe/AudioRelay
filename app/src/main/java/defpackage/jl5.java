package defpackage;

import android.content.BroadcastReceiver;
import android.os.PowerManager;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class jl5 extends BroadcastReceiver {
    public static final SparseArray<PowerManager.WakeLock> w = new SparseArray<>();
    public static int x = 1;
}
