package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzeq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class jx5 extends a16 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzq c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzau e;

    public jx5(zzau zzauVar, Context context, zzq zzqVar, String str) {
        this.e = zzauVar;
        this.b = context;
        this.c = zzqVar;
        this.d = str;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        zzau.a(this.b, "search");
        return new zzeq();
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzf(new ObjectWrapper(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object c() {
        return this.e.a.zza(this.b, this.c, this.d, null, 3);
    }
}
