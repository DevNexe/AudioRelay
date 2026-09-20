package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import kotlin.KotlinNullPointerException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class va3 implements g52 {
    public final SharedPreferences a;
    public final Locale b;

    public va3(Context context, Locale locale) {
        this.b = locale;
        this.a = context.getSharedPreferences("lingver_preference", 0);
    }

    @Override // defpackage.g52
    public final boolean a() {
        return this.a.getBoolean("follow_system_locale_key", false);
    }

    @Override // defpackage.g52
    public final void b(boolean z) {
        this.a.edit().putBoolean("follow_system_locale_key", z).apply();
    }

    @Override // defpackage.g52
    public final void c(Locale locale) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("language", locale.getLanguage());
        jSONObject.put("country", locale.getCountry());
        jSONObject.put("variant", locale.getVariant());
        this.a.edit().putString("language_key", jSONObject.toString()).apply();
    }

    @Override // defpackage.g52
    public final Locale d() {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("language_key", null);
        if (string == null || iv4.s(string)) {
            return this.b;
        }
        String string2 = sharedPreferences.getString("language_key", null);
        if (string2 != null) {
            JSONObject jSONObject = new JSONObject(string2);
            return new Locale(jSONObject.getString("language"), jSONObject.getString("country"), jSONObject.getString("variant"));
        }
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        ur1.c(ur1.class.getName(), kotlinNullPointerException);
        throw kotlinNullPointerException;
    }
}
