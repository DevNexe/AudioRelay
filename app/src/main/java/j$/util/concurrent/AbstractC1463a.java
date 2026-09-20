package j$.util.concurrent;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.util.concurrent.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1463a {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }
}
