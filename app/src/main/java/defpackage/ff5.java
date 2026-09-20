package defpackage;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public final class ff5 {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
