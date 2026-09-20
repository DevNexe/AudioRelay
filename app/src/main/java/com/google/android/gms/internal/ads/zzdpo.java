package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ss3;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpo {
    public final zzg a;
    public final zzfdn b;
    public final zzdot c;
    public final zzdoo d;
    public final zzdpz e;
    public final zzdqh f;
    public final Executor g;
    public final Executor h;
    public final zzblo i;
    public final zzdol j;

    public zzdpo(zzg zzgVar, zzfdn zzfdnVar, zzdot zzdotVar, zzdoo zzdooVar, zzdpz zzdpzVar, zzdqh zzdqhVar, Executor executor, Executor executor2, zzdol zzdolVar) {
        this.a = zzgVar;
        this.b = zzfdnVar;
        this.i = zzfdnVar.zzi;
        this.c = zzdotVar;
        this.d = zzdooVar;
        this.e = zzdpzVar;
        this.f = zzdqhVar;
        this.g = executor;
        this.h = executor2;
        this.j = zzdolVar;
    }

    public static void a(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final boolean b(ViewGroup viewGroup, boolean z) {
        zzdoo zzdooVar = this.d;
        View viewZzf = z ? zzdooVar.zzf() : zzdooVar.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcU)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zzc(zzdqj zzdqjVar) {
        zzdpz zzdpzVar;
        if (zzdqjVar == null || (zzdpzVar = this.e) == null || zzdqjVar.zzh() == null || !this.c.zzg()) {
            return;
        }
        try {
            zzdqjVar.zzh().addView(zzdpzVar.zza());
        } catch (zzcmy e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdqj zzdqjVar) {
        if (zzdqjVar == null) {
            return;
        }
        Context context = zzdqjVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.c.a)) {
            if (!(context instanceof Activity)) {
                zzcgn.zze("Activity context is needed for policy validator.");
                return;
            }
            zzdqh zzdqhVar = this.f;
            if (zzdqhVar == null || zzdqjVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdqhVar.zza(zzdqjVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
            } catch (zzcmy e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdqj zzdqjVar) {
        this.g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpm
            /* JADX WARN: Code duplicated, block: B:79:0x0194  */
            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup viewGroup;
                View viewZze;
                final ViewGroup viewGroup2;
                zzblx zzblxVarZza;
                Drawable drawable;
                final zzdpo zzdpoVar = this.zza;
                zzdqj zzdqjVar2 = zzdqjVar;
                zzdot zzdotVar = zzdpoVar.c;
                if (!zzdotVar.zzf() && !zzdotVar.zze()) {
                    viewGroup = null;
                    break;
                }
                String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        viewGroup = null;
                        break;
                    }
                    View viewZzg = zzdqjVar2.zzg(strArr[i]);
                    if (viewZzg != null && (viewZzg instanceof ViewGroup)) {
                        viewGroup = (ViewGroup) viewZzg;
                        break;
                    }
                    i++;
                }
                Context context = zzdqjVar2.zzf().getContext();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                zzdoo zzdooVar = zzdpoVar.d;
                if (zzdooVar.zze() != null) {
                    viewZze = zzdooVar.zze();
                    zzblo zzbloVar = zzdpoVar.i;
                    if (zzbloVar != null && viewGroup == null) {
                        zzdpo.a(layoutParams, zzbloVar.zze);
                        viewZze.setLayoutParams(layoutParams);
                    }
                } else if (zzdooVar.zzl() instanceof zzblj) {
                    zzblj zzbljVar = (zzblj) zzdooVar.zzl();
                    if (viewGroup == null) {
                        zzdpo.a(layoutParams, zzbljVar.zzc());
                    }
                    zzblk zzblkVar = new zzblk(context, zzbljVar, layoutParams);
                    zzblkVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcS));
                    viewZze = zzblkVar;
                } else {
                    viewZze = null;
                }
                if (viewZze != null) {
                    if (viewZze.getParent() instanceof ViewGroup) {
                        ((ViewGroup) viewZze.getParent()).removeView(viewZze);
                    }
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                        viewGroup.addView(viewZze);
                    } else {
                        com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdqjVar2.zzf().getContext());
                        zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        zzaVar.addView(viewZze);
                        FrameLayout frameLayoutZzh = zzdqjVar2.zzh();
                        if (frameLayoutZzh != null) {
                            frameLayoutZzh.addView(zzaVar);
                        }
                    }
                    zzdqjVar2.zzq(zzdqjVar2.zzk(), viewZze, true);
                }
                zzfuv zzfuvVar = zzdpk.zza;
                int size = zzfuvVar.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        viewGroup2 = null;
                        break;
                    }
                    View viewZzg2 = zzdqjVar2.zzg((String) zzfuvVar.get(i2));
                    i2++;
                    if (viewZzg2 instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) viewZzg2;
                        break;
                    }
                }
                zzdpoVar.h.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdpo zzdpoVar2 = zzdpoVar;
                        ViewGroup viewGroup3 = viewGroup2;
                        zzdpoVar2.getClass();
                        boolean z = viewGroup3 != null;
                        zzdoo zzdooVar2 = zzdpoVar2.d;
                        if (zzdooVar2.zzf() != null) {
                            int iZzc = zzdooVar2.zzc();
                            zzfdn zzfdnVar = zzdpoVar2.b;
                            zzg zzgVar = zzdpoVar2.a;
                            if (iZzc == 2 || zzdooVar2.zzc() == 1) {
                                zzgVar.zzI(zzfdnVar.zzf, String.valueOf(zzdooVar2.zzc()), z);
                            } else if (zzdooVar2.zzc() == 6) {
                                zzgVar.zzI(zzfdnVar.zzf, "2", z);
                                zzgVar.zzI(zzfdnVar.zzf, "1", z);
                            }
                        }
                    }
                });
                if (viewGroup2 == null) {
                    return;
                }
                if (zzdpoVar.b(viewGroup2, true)) {
                    if (zzdooVar.zzr() != null) {
                        zzdooVar.zzr().zzaq(new ss3(10, zzdqjVar2, viewGroup2));
                        return;
                    }
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzie)).booleanValue() && zzdpoVar.b(viewGroup2, false)) {
                    if (zzdooVar.zzp() != null) {
                        zzdooVar.zzp().zzaq(new ss3(10, zzdqjVar2, viewGroup2));
                        return;
                    }
                    return;
                }
                viewGroup2.removeAllViews();
                View viewZzf = zzdqjVar2.zzf();
                Context context2 = viewZzf != null ? viewZzf.getContext() : null;
                if (context2 == null || (zzblxVarZza = zzdpoVar.j.zza()) == null) {
                    return;
                }
                try {
                    IObjectWrapper iObjectWrapperZzi = zzblxVarZza.zzi();
                    if (iObjectWrapperZzi == null || (drawable = (Drawable) ObjectWrapper.M0(iObjectWrapperZzi)) == null) {
                        return;
                    }
                    ImageView imageView = new ImageView(context2);
                    imageView.setImageDrawable(drawable);
                    IObjectWrapper iObjectWrapperZzj = zzdqjVar2.zzj();
                    if (iObjectWrapperZzj == null) {
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    } else if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfi)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.M0(iObjectWrapperZzj));
                    } else {
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    }
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                } catch (RemoteException unused) {
                    zzcgn.zzj("Could not get main image drawable");
                }
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return b(viewGroup, true);
    }
}
