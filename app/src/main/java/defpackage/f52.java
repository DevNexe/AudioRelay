package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f52 implements d52 {
    public final LocaleList a;

    public f52(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // defpackage.d52
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((d52) obj).a());
    }

    @Override // defpackage.d52
    public final Locale get() {
        return this.a.get(0);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
