package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class mm6 extends zzfqw {
    public final /* synthetic */ IBinder x;
    public final /* synthetic */ om6 y;

    public mm6(om6 om6Var, IBinder iBinder) {
        this.y = om6Var;
        this.x = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void a() {
        om6 om6Var = this.y;
        om6Var.a.m = zzfqr.zzb(this.x);
        zzfrg zzfrgVar = om6Var.a;
        zzfrgVar.b.zzd("linkToDeath", new Object[0]);
        try {
            zzfrgVar.m.asBinder().linkToDeath(zzfrgVar.j, 0);
        } catch (RemoteException e) {
            zzfrgVar.b.zzc(e, "linkToDeath failed", new Object[0]);
        }
        zzfrgVar.g = false;
        Iterator it = zzfrgVar.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zzfrgVar.d.clear();
    }
}
