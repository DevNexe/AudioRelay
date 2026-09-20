package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcwj;
import com.google.android.gms.internal.ads.zzcww;
import com.google.android.gms.internal.ads.zzeod;
import com.google.android.gms.internal.ads.zzexo;
import com.google.android.gms.internal.ads.zzfdr;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class wi6 implements zzeod {
    public final /* synthetic */ zzexo w;

    public wi6(zzexo zzexoVar) {
        this.w = zzexoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeod, defpackage.zc7
    /* JADX INFO: renamed from: zza */
    public final void mo45zza() {
        this.w.G = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    @Override // com.google.android.gms.internal.ads.zzeod
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean zZzh;
        int iIntValue;
        boolean z;
        int i;
        int i2;
        int i3;
        zzcwj zzcwjVar = (zzcwj) obj;
        zzexo zzexoVar = this.w;
        zzcwj zzcwjVar2 = zzexoVar.G;
        if (zzcwjVar2 != null) {
            zzcwjVar2.zzV();
        }
        zzexoVar.G = zzcwjVar;
        FrameLayout frameLayout = zzexoVar.y;
        frameLayout.removeAllViews();
        View viewZzb = zzcwjVar.zzb();
        zzt.zzq();
        frameLayout.addView(viewZzb, zzs.zzn());
        boolean zZze = zzcwjVar.zze();
        Context context = zzexoVar.x;
        if (zZze) {
            zZzh = zzcwjVar.zzh();
            iIntValue = ((Integer) zzay.zzc().zzb(zzbiy.zzdW)).intValue();
            zzq zzqVar = new zzq();
            zzqVar.zzd = 50;
            z = false;
            if (true != zZzh) {
                i = 0;
            } else {
                i = iIntValue;
            }
            zzqVar.zza = i;
            if (true != zZzh) {
                i2 = iIntValue;
            } else {
                i2 = 0;
            }
            zzqVar.zzb = i2;
            zzqVar.zzc = iIntValue;
            zzr zzrVar = new zzr(context, zzqVar, zzexoVar);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            if (true != zzcwjVar.zzh()) {
                i3 = 9;
            } else {
                i3 = 11;
            }
            layoutParams.addRule(i3);
            if (zzcwjVar.zzg()) {
                z = true;
            }
            zzrVar.zzb(z);
            frameLayout.addView(zzrVar, layoutParams);
        } else {
            if (zzexoVar.D.zzc < ((Integer) zzay.zzc().zzb(zzbiy.zzem)).intValue()) {
                zZzh = zzcwjVar.zzh();
                iIntValue = ((Integer) zzay.zzc().zzb(zzbiy.zzdW)).intValue();
                zzq zzqVar2 = new zzq();
                zzqVar2.zzd = 50;
                z = false;
                if (true != zZzh) {
                    i = 0;
                } else {
                    i = iIntValue;
                }
                zzqVar2.zza = i;
                if (true != zZzh) {
                    i2 = iIntValue;
                } else {
                    i2 = 0;
                }
                zzqVar2.zzb = i2;
                zzqVar2.zzc = iIntValue;
                zzr zzrVar2 = new zzr(context, zzqVar2, zzexoVar);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(10);
                if (true != zzcwjVar.zzh()) {
                    i3 = 9;
                } else {
                    i3 = 11;
                }
                layoutParams2.addRule(i3);
                if (zzcwjVar.zzg() && !zzcwjVar.zzf()) {
                    z = true;
                }
                zzrVar2.zzb(z);
                frameLayout.addView(zzrVar2, layoutParams2);
            }
        }
        zzcwjVar.zzd(zzexoVar);
        frameLayout.setMinimumHeight(zzfdr.zza(context, Collections.singletonList(zzexoVar.G.zzc())).zzc);
        frameLayout.setMinimumWidth(zzfdr.zza(context, Collections.singletonList(zzexoVar.G.zzc())).zzf);
        zzexoVar.C.zzl(new zzcww(zzcwjVar, zzexoVar));
        zzcwjVar.zzW();
    }
}
