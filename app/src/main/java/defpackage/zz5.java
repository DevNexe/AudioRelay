package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzase;
import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzasn;
import com.google.android.gms.internal.ads.zzasp;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzaze;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class zz5 extends Handler {
    public final /* synthetic */ a06 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz5(a06 a06Var, Looper looper) {
        super(looper);
        this.a = a06Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a06 a06Var = this.a;
        a06Var.getClass();
        int i = message.what;
        CopyOnWriteArraySet copyOnWriteArraySet = a06Var.f;
        switch (i) {
            case 0:
                a06Var.m--;
                return;
            case 1:
                a06Var.k = message.arg1;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((zzasf) it.next()).zzd(a06Var.j, a06Var.k);
                }
                return;
            case 2:
                a06Var.n = message.arg1 != 0;
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    ((zzasf) it2.next()).zza(a06Var.n);
                }
                return;
            case 3:
                if (a06Var.m == 0) {
                    zzaze zzazeVar = (zzaze) message.obj;
                    a06Var.i = true;
                    a06Var.q = zzazeVar.zza;
                    a06Var.r = zzazeVar.zzb;
                    a06Var.b.zzd(zzazeVar.zzc);
                    Iterator it3 = copyOnWriteArraySet.iterator();
                    while (it3.hasNext()) {
                        ((zzasf) it3.next()).zzg(a06Var.q, a06Var.r);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = a06Var.l - 1;
                a06Var.l = i2;
                if (i2 == 0) {
                    a06Var.t = (zzasn) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            ((zzasf) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (a06Var.l == 0) {
                    a06Var.t = (zzasn) message.obj;
                    Iterator it5 = copyOnWriteArraySet.iterator();
                    while (it5.hasNext()) {
                        ((zzasf) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zzasp zzaspVar = (zzasp) message.obj;
                a06Var.l -= zzaspVar.zzd;
                if (a06Var.m == 0) {
                    a06Var.o = zzaspVar.zza;
                    a06Var.p = zzaspVar.zzb;
                    a06Var.t = zzaspVar.zzc;
                    Iterator it6 = copyOnWriteArraySet.iterator();
                    while (it6.hasNext()) {
                        ((zzasf) it6.next()).zzf(a06Var.o, a06Var.p);
                    }
                    return;
                }
                return;
            case 7:
                zzasw zzaswVar = (zzasw) message.obj;
                if (a06Var.s.equals(zzaswVar)) {
                    return;
                }
                a06Var.s = zzaswVar;
                Iterator it7 = copyOnWriteArraySet.iterator();
                while (it7.hasNext()) {
                    ((zzasf) it7.next()).zzb(zzaswVar);
                }
                return;
            case 8:
                zzase zzaseVar = (zzase) message.obj;
                Iterator it8 = copyOnWriteArraySet.iterator();
                while (it8.hasNext()) {
                    ((zzasf) it8.next()).zzc(zzaseVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
