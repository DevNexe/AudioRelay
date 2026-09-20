package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class tu6 {
    public final ArrayDeque a = new ArrayDeque();

    public final void a(zzgnf zzgnfVar) {
        if (!zzgnfVar.f()) {
            if (!(zzgnfVar instanceof vu6)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgnfVar.getClass())));
            }
            vu6 vu6Var = (vu6) zzgnfVar;
            a(vu6Var.y);
            a(vu6Var.z);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(vu6.C, zzgnfVar.zzd());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iS = vu6.s(iBinarySearch + 1);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty() || ((zzgnf) arrayDeque.peek()).zzd() >= iS) {
            arrayDeque.push(zzgnfVar);
            return;
        }
        int iS2 = vu6.s(iBinarySearch);
        zzgnf vu6Var2 = (zzgnf) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((zzgnf) arrayDeque.peek()).zzd() < iS2) {
            vu6Var2 = new vu6((zzgnf) arrayDeque.pop(), vu6Var2);
        }
        vu6 vu6Var3 = new vu6(vu6Var2, zzgnfVar);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(vu6.C, vu6Var3.x);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((zzgnf) arrayDeque.peek()).zzd() >= vu6.s(iBinarySearch2 + 1)) {
                break;
            } else {
                vu6Var3 = new vu6((zzgnf) arrayDeque.pop(), vu6Var3);
            }
        }
        arrayDeque.push(vu6Var3);
    }
}
