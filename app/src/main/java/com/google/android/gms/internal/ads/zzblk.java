package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzblk extends RelativeLayout {
    public static final float[] x = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    public final AnimationDrawable w;

    public zzblk(Context context, zzblj zzbljVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        oa3.h(zzbljVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(x, null, null));
        shapeDrawable.getPaint().setColor(zzbljVar.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbljVar.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbljVar.zzg());
            textView.setTextColor(zzbljVar.zze());
            textView.setTextSize(zzbljVar.zzf());
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            int iZzw = zzcgg.zzw(context, 4);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            textView.setPadding(iZzw, 0, zzcgg.zzw(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listZzi = zzbljVar.zzi();
        if (listZzi != null && listZzi.size() > 1) {
            this.w = new AnimationDrawable();
            Iterator it = listZzi.iterator();
            while (it.hasNext()) {
                try {
                    this.w.addFrame((Drawable) ObjectWrapper.M0(((zzblm) it.next()).zzf()), zzbljVar.zzb());
                } catch (Exception e) {
                    zzcgn.zzh("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.w);
        } else if (listZzi.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.M0(((zzblm) listZzi.get(0)).zzf()));
            } catch (Exception e2) {
                zzcgn.zzh("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.w;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
