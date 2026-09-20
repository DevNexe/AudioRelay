package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import defpackage.j17;

/* JADX INFO: loaded from: classes.dex */
public final class j17 extends zzb {
    public final /* synthetic */ zzl b;

    public /* synthetic */ j17(zzl zzlVar) {
        this.b = zzlVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        zzbw zzbwVarZzv = zzt.zzv();
        zzl zzlVar = this.b;
        Bitmap bitmapZza = zzbwVarZzv.zza(Integer.valueOf(zzlVar.x.zzo.zzf));
        if (bitmapZza != null) {
            zzt.zzq();
            Activity activity = zzlVar.w;
            zzj zzjVar = zzlVar.x.zzo;
            boolean z = zzjVar.zzd;
            float f = zzjVar.zze;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapZza, bitmapZza.getWidth(), bitmapZza.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
                }
            }
            zzs.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    j17 j17Var = this.zza;
                    j17Var.b.w.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
