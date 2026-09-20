package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hm6 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
