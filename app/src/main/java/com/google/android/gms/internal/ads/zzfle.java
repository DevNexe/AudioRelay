package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfle {
    public static WindowManager a;
    public static final String[] b = {"x", "y", "width", "height"};
    public static float c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject zza(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / c);
            jSONObject.put("y", i2 / c);
            jSONObject.put("width", i3 / c);
            jSONObject.put("height", i4 / c);
        } catch (JSONException e) {
            zzflf.zza("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            zzflf.zza("Error with setting ad session id", e);
        }
    }

    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void zzd(JSONObject jSONObject, zzfli zzfliVar) {
        zzfkq zzfkqVarZza = zzfliVar.zza();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayListZzb = zzfliVar.zzb();
        int size = arrayListZzb.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put((String) arrayListZzb.get(i));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", zzfkqVarZza.zzd());
            jSONObject.put("friendlyObstructionPurpose", zzfkqVarZza.zza());
            jSONObject.put("friendlyObstructionReason", zzfkqVarZza.zzc());
        } catch (JSONException e) {
            zzflf.zza("Error with setting friendly obstruction", e);
        }
    }

    public static void zze(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            zzflf.zza("Error with setting not visible reason", e);
        }
    }

    public static void zzf(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            zzflf.zza("Error with setting not visible reason", e);
        }
    }

    public static void zzg(Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zzh(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            zzflf.zza("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    public static void zzi(JSONObject jSONObject) {
        float f;
        float f2;
        if (a != null) {
            Point point = new Point(0, 0);
            a.getDefaultDisplay().getRealSize(point);
            float f3 = point.x;
            float f4 = c;
            f = f3 / f4;
            f2 = point.y / f4;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf A[LOOP:1: B:60:0x00bb->B:64:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3 A[SYNTHETIC] */
    public static boolean zzj(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = b;
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (jSONObject.optDouble(str) == jSONObject2.optDouble(str)) {
                }
            }
            if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null) {
                    }
                    if ((jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 == null) || !(jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray.length() != jSONArrayOptJSONArray2.length())) {
                        for (i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            if (zzj(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                            }
                        }
                        return true;
                    }
                } else if ((jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) || !(jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray3.length() != jSONArrayOptJSONArray4.length())) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                        if (jSONArrayOptJSONArray3.optString(i3, "").equals(jSONArrayOptJSONArray4.optString(i3, ""))) {
                        }
                    }
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 != null) {
                        if ((jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 == null) || !(jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray.length() != jSONArrayOptJSONArray2.length())) {
                            while (i < jSONArrayOptJSONArray.length()) {
                                if (zzj(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
