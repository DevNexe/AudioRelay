package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzcoc;
import com.google.android.gms.internal.ads.zzcxa;
import com.google.android.gms.internal.ads.zzcza;
import com.google.android.gms.internal.ads.zzczb;
import com.google.android.gms.internal.ads.zzdkn;
import com.google.android.gms.internal.ads.zzdoz;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfct;
import com.google.android.gms.internal.ads.zzfdr;
import com.google.android.gms.internal.ads.zzfds;
import com.google.android.gms.internal.ads.zzgul;
import defpackage.wc6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class wc6 extends zzcxa {
    public final Context i;
    public final View j;
    public final zzcmn k;
    public final zzfct l;
    public final zzcza m;
    public final zzdoz n;
    public final zzdkn o;
    public final zzgul p;
    public final Executor q;
    public zzq r;

    public wc6(zzczb zzczbVar, Context context, zzfct zzfctVar, View view, zzcmn zzcmnVar, zzcza zzczaVar, zzdoz zzdozVar, zzdkn zzdknVar, zzgul zzgulVar, Executor executor) {
        super(zzczbVar);
        this.i = context;
        this.j = view;
        this.k = zzcmnVar;
        this.l = zzfctVar;
        this.m = zzczaVar;
        this.n = zzdozVar;
        this.o = zzdknVar;
        this.p = zzgulVar;
        this.q = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzW() {
        this.q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxc
            @Override // java.lang.Runnable
            public final void run() {
                wc6 wc6Var = this.zza;
                zzdoz zzdozVar = wc6Var.n;
                if (zzdozVar.zze() == null) {
                    return;
                }
                try {
                    zzdozVar.zze().zze((zzbs) wc6Var.p.zzb(), new ObjectWrapper(wc6Var.i));
                } catch (RemoteException e) {
                    zzcgn.zzh("RemoteException when notifyAdLoad is called", e);
                }
            }
        });
        super.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final int zza() {
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzgF)).booleanValue() && this.b.zzai) {
            if (!((Boolean) zzay.zzc().zzb(zzbiy.zzgG)).booleanValue()) {
                return 0;
            }
        }
        return this.a.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final View zzc() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final zzdk zzd() {
        try {
            return this.m.zza();
        } catch (zzfds unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final zzfct zze() {
        zzq zzqVar = this.r;
        if (zzqVar != null) {
            return zzfdr.zzc(zzqVar);
        }
        zzfcs zzfcsVar = this.b;
        if (zzfcsVar.zzad) {
            for (String str : zzfcsVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.j;
            return new zzfct(view.getWidth(), view.getHeight(), false);
        }
        return zzfdr.zzb(zzfcsVar.zzs, this.l);
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final zzfct zzf() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzg() {
        this.o.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzh(ViewGroup viewGroup, zzq zzqVar) {
        zzcmn zzcmnVar;
        if (viewGroup == null || (zzcmnVar = this.k) == null) {
            return;
        }
        zzcmnVar.zzai(zzcoc.zzc(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.r = zzqVar;
    }
}
