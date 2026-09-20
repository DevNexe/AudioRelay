package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzeq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public final class xw5 extends a16 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzq c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzbvf e;
    public final /* synthetic */ zzau f;

    public xw5(zzau zzauVar, Context context, zzq zzqVar, String str, zzbvf zzbvfVar) {
        this.f = zzauVar;
        this.b = context;
        this.c = zzqVar;
        this.d = str;
        this.e = zzbvfVar;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        zzau.a(this.b, "app_open");
        return new zzeq();
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzc(new ObjectWrapper(this.b), this.c, this.d, this.e, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f.a.zza(this.b, this.c, this.d, this.e, 4);
    }
}
