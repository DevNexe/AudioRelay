package defpackage;

import android.os.Binder;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzayo;
import com.google.android.gms.internal.ads.zzayp;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzckr;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzwq;

/* JADX INFO: loaded from: classes3.dex */
public final class pz5 implements Runnable {
    public final /* synthetic */ int w;
    public final Object x;

    public pz5(zzato zzatoVar) {
        this.w = 1;
        this.x = zzatoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w) {
            case 0:
                zzaqi zzaqiVar = (zzaqi) this.x;
                Handler handler = zzaqi.I;
                zzaqiVar.d();
                break;
            case 1:
                break;
            case 2:
                i26 i26Var = (i26) this.x;
                if (!i26Var.b0 && !i26Var.N && i26Var.L != null && i26Var.M) {
                    SparseArray sparseArray = i26Var.J;
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        if (((zzayj) sparseArray.valueAt(i)).zzh() == null) {
                        }
                        break;
                    }
                    i26Var.F.zzb();
                    zzayo[] zzayoVarArr = new zzayo[size];
                    i26Var.U = new boolean[size];
                    i26Var.T = new boolean[size];
                    i26Var.S = i26Var.L.zza();
                    int i2 = 0;
                    while (true) {
                        boolean z = true;
                        if (i2 >= size) {
                            i26Var.R = new zzayp(zzayoVarArr);
                            i26Var.N = true;
                            i26Var.B.zzg(new zzayn(i26Var.S, i26Var.L.zzc()), null);
                            i26Var.K.zzf(i26Var);
                        } else {
                            zzass zzassVarZzh = ((zzayj) sparseArray.valueAt(i2)).zzh();
                            zzayoVarArr[i2] = new zzayo(zzassVarZzh);
                            String str = zzassVarZzh.zzf;
                            if (!zzbad.zzb(str) && !zzbad.zza(str)) {
                                z = false;
                            }
                            i26Var.U[i2] = z;
                            i26Var.V = z | i26Var.V;
                            i2++;
                        }
                        break;
                    }
                }
                break;
            case 3:
                zzbdt.a((zzbdt) this.x);
                break;
            case 4:
                zzbrk zzbrkVar = (zzbrk) this.x;
                if (zzbrkVar.a != null) {
                    zzbrkVar.a.disconnect();
                    Binder.flushPendingCommands();
                    break;
                }
                break;
            case 5:
                zzt.zzz().zzc((zzckr) this.x);
                break;
            case 6:
                ((zzflq) this.x).e.zzb();
                break;
            default:
                ((zzwq) this.x).zzI();
                break;
        }
    }

    public /* synthetic */ pz5(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }
}
