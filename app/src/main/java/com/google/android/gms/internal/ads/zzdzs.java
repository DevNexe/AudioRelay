package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.nx2;
import defpackage.so5;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzs {
    public final Context a;
    public final ApplicationInfo b;
    public String e = "";
    public final int c = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhM)).intValue();
    public final int d = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhN)).intValue();

    public zzdzs(Context context) {
        this.a = context;
        this.b = context.getApplicationInfo();
    }

    public final JSONObject zza() throws JSONException {
        Drawable applicationIcon;
        String strEncodeToString;
        ApplicationInfo applicationInfo = this.b;
        Context context = this.a;
        JSONObject jSONObject = new JSONObject();
        try {
            nx2 nx2VarA = so5.a(context);
            String str = applicationInfo.packageName;
            Context context2 = nx2VarA.a;
            jSONObject.put(MediationMetaData.KEY_NAME, context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        com.google.android.gms.ads.internal.zzt.zzq();
        jSONObject.put("adMobAppId", com.google.android.gms.ads.internal.util.zzs.zzo(context));
        boolean zIsEmpty = this.e.isEmpty();
        int i = this.d;
        int i2 = this.c;
        if (zIsEmpty) {
            try {
                nx2 nx2VarA2 = so5.a(context);
                String str2 = applicationInfo.packageName;
                Context context3 = nx2VarA2.a;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused2) {
                applicationIcon = null;
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                applicationIcon.setBounds(0, 0, i2, i);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.e = strEncodeToString;
        }
        if (!this.e.isEmpty()) {
            jSONObject.put("icon", this.e);
            jSONObject.put("iconWidthPx", i2);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }
}
