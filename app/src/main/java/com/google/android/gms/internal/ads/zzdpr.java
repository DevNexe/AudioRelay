package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookAdapter;
import defpackage.ft;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpr implements View.OnClickListener {
    public String A;
    public Long B;
    public WeakReference C;
    public final zzdtl w;
    public final ft x;
    public zzbnu y;
    public zzdpq z;

    public zzdpr(zzdtl zzdtlVar, ft ftVar) {
        this.w = zzdtlVar;
        this.x = ftVar;
    }

    public final void a() {
        View view;
        this.A = null;
        this.B = null;
        WeakReference weakReference = this.C;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.C = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.C;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.A != null && this.B != null) {
            HashMap map = new HashMap();
            map.put(FacebookAdapter.KEY_ID, this.A);
            map.put("time_interval", String.valueOf(this.x.b() - this.B.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.w.zzg("sendMessageToNativeJs", map);
        }
        a();
    }

    public final zzbnu zza() {
        return this.y;
    }

    public final void zzb() {
        if (this.y == null || this.B == null) {
            return;
        }
        a();
        try {
            this.y.zze();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzbpq, com.google.android.gms.internal.ads.zzdpq] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzc(final zzbnu zzbnuVar) {
        this.y = zzbnuVar;
        zzdpq zzdpqVar = this.z;
        zzdtl zzdtlVar = this.w;
        if (zzdpqVar != null) {
            zzdtlVar.zzk("/unconfirmedClick", zzdpqVar);
        }
        ?? r0 = new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdpq
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                zzdpr zzdprVar = this.zza;
                zzbnu zzbnuVar2 = zzbnuVar;
                try {
                    zzdprVar.B = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzcgn.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdprVar.A = (String) map.get(FacebookAdapter.KEY_ID);
                String str = (String) map.get("asset_id");
                if (zzbnuVar2 == null) {
                    zzcgn.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbnuVar2.zzf(str);
                } catch (RemoteException e) {
                    zzcgn.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.z = r0;
        zzdtlVar.zzi("/unconfirmedClick", r0);
    }
}
