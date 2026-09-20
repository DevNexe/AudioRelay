package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.q36;
import defpackage.vm2;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbcl extends Thread {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public boolean w;
    public boolean x;
    public final Object y;
    public final zzbcc z;

    public zzbcl() {
        zzbcc zzbccVar = new zzbcc();
        this.w = false;
        this.x = false;
        this.z = zzbccVar;
        this.y = new Object();
        this.B = ((Long) zzbkg.zzd.zze()).intValue();
        this.C = ((Long) zzbkg.zza.zze()).intValue();
        this.D = ((Long) zzbkg.zze.zze()).intValue();
        this.E = ((Long) zzbkg.zzc.zze()).intValue();
        this.F = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzQ)).intValue();
        this.G = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzR)).intValue();
        this.H = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzS)).intValue();
        this.A = ((Long) zzbkg.zzf.zze()).intValue();
        this.I = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzU);
        this.J = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzV)).booleanValue();
        this.K = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzW)).booleanValue();
        this.L = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzX)).booleanValue();
        setName("ContentFetchTask");
    }

    public final vm2 a(View view, zzbcb zzbcbVar) {
        if (view == null) {
            return new vm2(0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new vm2(0, 0);
            }
            zzbcbVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new vm2(1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcmn)) {
            WebView webView = (WebView) view;
            zzbcbVar.zzh();
            webView.post(new q36(this, zzbcbVar, webView, globalVisibleRect));
            return new vm2(0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new vm2(0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            vm2 vm2VarA = a(viewGroup.getChildAt(i3), zzbcbVar);
            i += vm2VarA.a;
            i2 += vm2VarA.b;
        }
        return new vm2(i, i2);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ef */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd A[EXC_TOP_SPLITTER, LOOP:1: B:65:0x00dd->B:70:0x00dd, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcl.run():void");
    }

    public final zzbcb zza() {
        return this.z.zza(this.L);
    }

    public final void zze() {
        synchronized (this.y) {
            if (this.w) {
                zzcgn.zze("Content hash thread already started, quiting...");
            } else {
                this.w = true;
                start();
            }
        }
    }

    public final void zzf() {
        synchronized (this.y) {
            this.x = true;
            zzcgn.zze("ContentFetchThread: paused, mPause = true");
        }
    }

    public final void zzg() {
        synchronized (this.y) {
            this.x = false;
            this.y.notifyAll();
            zzcgn.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.x;
    }
}
