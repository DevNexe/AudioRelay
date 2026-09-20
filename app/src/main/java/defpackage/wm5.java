package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.azefsw.audioconnect.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wm5 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final js4 a(Context context) {
        js4 js4Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            Object objF = linkedHashMap.get(context);
            if (objF == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                NUlFixed nUlA = AY.a(-1, null, 6);
                d24 d24Var = new d24(new um5(contentResolver, uriFor, new vm5(nUlA, ib1.a(Looper.getMainLooper())), nUlA, context, null));
                xw4 xw4VarD = ddf.d();
                qh0 qh0Var = rl0.a;
                objF = kd.F(d24Var, new w80(la0.QnHx.a(xw4VarD, n72.a)), new wr4(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, objF);
            }
            js4Var = (js4) objF;
        }
        return js4Var;
    }

    public static final l40 b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof l40) {
            return (l40) tag;
        }
        return null;
    }
}
