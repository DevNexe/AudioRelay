package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public class ua3 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final ry4 b = new ry4(QnHx.w);
    public final ry4 c = new ry4(new CQf());

    public static final class CQf extends cx1 implements h81<SharedPreferences> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final SharedPreferences invoke() {
            StringBuilder sb = new StringBuilder();
            ua3 ua3Var = ua3.this;
            Context context = ua3Var.a;
            sb.append(context.getPackageName());
            sb.append("_preferences");
            SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
            sharedPreferences.registerOnSharedPreferenceChangeListener(ua3Var);
            return sharedPreferences;
        }
    }

    public static final class QnHx extends cx1 implements h81<dw4<String>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final dw4<String> invoke() {
            return new rg3().G();
        }
    }

    public ua3(Context context) {
        this.a = context;
    }

    public final boolean c(String str, boolean z) {
        return e().getBoolean(str, z);
    }

    public final String d(int i) {
        return this.a.getResources().getString(i);
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.c.getValue();
    }

    public final String f(String str) {
        return e().getString(str, null);
    }

    public final void g(String str, boolean z) {
        e().edit().putBoolean(str, z).apply();
    }

    public final void h(int i, String str) {
        e().edit().putInt(str, i).apply();
    }

    public final void i(String str, String str2) {
        e().edit().putString(str, str2).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ((dw4) this.b.getValue()).g(str);
    }
}
