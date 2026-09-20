package defpackage;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzfph;

/* JADX INFO: loaded from: classes3.dex */
public final class f96 implements Runnable {
    public final /* synthetic */ int w;
    public boolean x;
    public final Object y;

    public f96(zzcik zzcikVar) {
        this.w = 0;
        this.x = false;
        this.y = zzcikVar;
    }

    public final void a() {
        this.x = true;
        ((zzcik) this.y).c();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w) {
            case 0:
                if (!this.x) {
                    ((zzcik) this.y).c();
                    zzfph zzfphVar = zzs.zza;
                    zzfphVar.removeCallbacks(this);
                    zzfphVar.postDelayed(this, 250L);
                }
                break;
            default:
                boolean zD = ((dy6) this.y).a.d();
                dq6 dq6Var = ((dy6) this.y).a;
                boolean z = dq6Var.A != null && dq6Var.A.booleanValue();
                ((dy6) this.y).a.A = Boolean.valueOf(this.x);
                if (z == this.x) {
                    bi6 bi6Var = ((dy6) this.y).a.i;
                    dq6.h(bi6Var);
                    bi6Var.n.c(Boolean.valueOf(this.x), "Default data collection state already set to");
                }
                if (((dy6) this.y).a.d() != zD) {
                    boolean zD2 = ((dy6) this.y).a.d();
                    dq6 dq6Var2 = ((dy6) this.y).a;
                    if (zD2 != (dq6Var2.A != null && dq6Var2.A.booleanValue())) {
                        bi6 bi6Var2 = ((dy6) this.y).a.i;
                        dq6.h(bi6Var2);
                        bi6Var2.k.d(Boolean.valueOf(this.x), "Default data collection is different than actual status", Boolean.valueOf(zD));
                    }
                } else {
                    bi6 bi6Var3 = ((dy6) this.y).a.i;
                    dq6.h(bi6Var3);
                    bi6Var3.k.d(Boolean.valueOf(this.x), "Default data collection is different than actual status", Boolean.valueOf(zD));
                }
                ((dy6) this.y).w();
                break;
        }
    }

    public f96(dy6 dy6Var, boolean z) {
        this.w = 1;
        this.y = dy6Var;
        this.x = z;
    }
}
