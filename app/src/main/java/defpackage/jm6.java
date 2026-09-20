package defpackage;

import android.os.IInterface;
import com.google.android.gms.internal.ads.zzfqv;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrh;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jm6 extends zzfqw {
    public final /* synthetic */ zzfqw x;
    public final /* synthetic */ zzfrg y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm6(zzfrg zzfrgVar, z05 z05Var, zzfqw zzfqwVar) {
        super(z05Var);
        this.y = zzfrgVar;
        this.x = zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void a() {
        zzfrg zzfrgVar = this.y;
        IInterface iInterface = zzfrgVar.m;
        ArrayList arrayList = zzfrgVar.d;
        zzfqw zzfqwVar = this.x;
        zzfqv zzfqvVar = zzfrgVar.b;
        if (iInterface != null || zzfrgVar.g) {
            if (!zzfrgVar.g) {
                zzfqwVar.run();
                return;
            } else {
                zzfqvVar.zzd("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zzfqwVar);
                return;
            }
        }
        zzfqvVar.zzd("Initiate binding to the service.", new Object[0]);
        arrayList.add(zzfqwVar);
        om6 om6Var = new om6(zzfrgVar);
        zzfrgVar.l = om6Var;
        zzfrgVar.g = true;
        if (zzfrgVar.a.bindService(zzfrgVar.h, om6Var, 1)) {
            return;
        }
        zzfqvVar.zzd("Failed to bind to the service.", new Object[0]);
        zzfrgVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zzfqw) it.next()).zzc(new zzfrh());
        }
        arrayList.clear();
    }
}
