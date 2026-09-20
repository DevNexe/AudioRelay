package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class gy5 {
    public final Application a;
    public final SharedPreferences b;
    public final HashSet c;

    public gy5(Application application) {
        this.a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.b = sharedPreferences;
        this.c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }
}
