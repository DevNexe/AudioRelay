package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcyo extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final Context w;
    public View x;

    public zzcyo(Context context) {
        super(context);
        this.w = context;
    }

    public static zzcyo zza(Context context, View view, zzfcs zzfcsVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcyo zzcyoVar = new zzcyo(context);
        boolean zIsEmpty = zzfcsVar.zzv.isEmpty();
        Context context2 = zzcyoVar.w;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfct zzfctVar = (zzfct) zzfcsVar.zzv.get(0);
            float f = zzfctVar.zza;
            float f2 = displayMetrics.density;
            zzcyoVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (zzfctVar.zzb * f2)));
        }
        zzcyoVar.x = view;
        zzcyoVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzy();
        zzchn.zzb(zzcyoVar, zzcyoVar);
        com.google.android.gms.ads.internal.zzt.zzy();
        zzchn.zza(zzcyoVar, zzcyoVar);
        JSONObject jSONObject = zzfcsVar.zzaj;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcyoVar.a(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcyoVar.a(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcyoVar.addView(relativeLayout);
        return zzcyoVar;
    }

    public final void a(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.w;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        int iZzw = zzcgg.zzw(context, (int) dOptDouble);
        textView.setPadding(0, iZzw, 0, iZzw);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzcgg.zzw(context, (int) dOptDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.x.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.x.setY(-iArr[1]);
    }
}
