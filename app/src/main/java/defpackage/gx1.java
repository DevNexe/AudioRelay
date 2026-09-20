package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class gx1 {
    public final String a;
    public final String b;
    public final String c;
    public final Locale d;
    public final String e;

    public static final class QnHx {
        public static gx1 a(String str) {
            if (!(!iv4.s(str))) {
                throw new IllegalArgumentException("Tag cannot be blank".toString());
            }
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            return new gx1(localeForLanguageTag.toLanguageTag(), localeForLanguageTag.getDisplayName(Locale.ENGLISH), localeForLanguageTag.getDisplayName(localeForLanguageTag));
        }
    }

    public gx1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        this.d = localeForLanguageTag;
        if (str3.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char cCharAt = str3.charAt(0);
            sb.append((Object) (Character.isLowerCase(cCharAt) ? Th.x(cCharAt, localeForLanguageTag) : String.valueOf(cCharAt)));
            sb.append(str3.substring(1));
            str3 = sb.toString();
        }
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx1)) {
            return false;
        }
        gx1 gx1Var = (gx1) obj;
        return ur1.a(this.a, gx1Var.a) && ur1.a(this.b, gx1Var.b) && ur1.a(this.c, gx1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bl2.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Language(tag=");
        sb.append(this.a);
        sb.append(", englishName=");
        sb.append(this.b);
        sb.append(", translatedName=");
        return i5.b(sb, this.c, ")");
    }
}
