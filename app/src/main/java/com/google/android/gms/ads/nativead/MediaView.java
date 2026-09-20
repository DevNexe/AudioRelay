package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public class MediaView extends FrameLayout {
    public zzb A;
    public zzc B;
    public MediaContent w;
    public boolean x;
    public ImageView.ScaleType y;
    public boolean z;

    public MediaView(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        zzbme zzbmeVar;
        this.z = true;
        this.y = scaleType;
        zzc zzcVar = this.B;
        if (zzcVar == null || (zzbmeVar = zzcVar.zza.x) == null || scaleType == null) {
            return;
        }
        try {
            zzbmeVar.zzbz(new ObjectWrapper(scaleType));
        } catch (RemoteException e) {
            zzcgn.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.x = true;
        this.w = mediaContent;
        zzb zzbVar = this.A;
        if (zzbVar != null) {
            zzbVar.zza.b(mediaContent);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
