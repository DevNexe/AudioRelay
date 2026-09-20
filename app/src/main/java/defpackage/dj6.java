package defpackage;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzfag;
import com.google.android.gms.internal.ads.zzfai;
import com.google.android.gms.internal.ads.zzffi;
import com.google.android.gms.internal.ads.zzfft;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class dj6 implements zzfft {
    public final zzfag a;
    public final zzfai b;
    public final zzl c;
    public final String d;
    public final Executor e;
    public final zzw f;
    public final zzffi g;

    public dj6(zzfag zzfagVar, zzfai zzfaiVar, zzl zzlVar, String str, Executor executor, zzw zzwVar, zzffi zzffiVar) {
        this.a = zzfagVar;
        this.b = zzfaiVar;
        this.c = zzlVar;
        this.d = str;
        this.e = executor;
        this.f = zzwVar;
        this.g = zzffiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfft
    public final zzffi zza() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzfft
    public final Executor zzb() {
        return this.e;
    }
}
