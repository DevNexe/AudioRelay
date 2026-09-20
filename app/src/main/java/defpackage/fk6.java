package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzffh;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class fk6 {
    public final int b;
    public final int c;
    public final LinkedList a = new LinkedList();
    public final kk6 d = new kk6();

    public fk6(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.a;
            if (linkedList.isEmpty()) {
                return;
            }
            if (zzt.zzB().b() - ((zzffh) linkedList.getFirst()).zzd < this.c) {
                return;
            }
            kk6 kk6Var = this.d;
            kk6Var.f++;
            kk6Var.b.zzb++;
            linkedList.remove();
        }
    }
}
