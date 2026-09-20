package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzccv;

/* JADX INFO: loaded from: classes.dex */
public final class h06 extends a16 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbvf d;

    public h06(Context context, String str, zzbvf zzbvfVar) {
        this.b = context;
        this.c = str;
        this.d = zzbvfVar;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        zzau.a(this.b, "rewarded");
        return new zzew();
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzn(new ObjectWrapper(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object c() {
        return zzccv.zza(this.b, this.c, this.d);
    }
}
