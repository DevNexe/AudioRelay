package defpackage;

import com.google.android.gms.internal.ads.zzcik;

/* JADX INFO: loaded from: classes3.dex */
public final class c96 implements Runnable {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ zzcik x;

    public c96(zzcik zzcikVar, boolean z) {
        this.x = zzcikVar;
        this.w = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = {"isVisible", String.valueOf(this.w)};
        int i = zzcik.O;
        this.x.b("windowVisibilityChanged", strArr);
    }
}
