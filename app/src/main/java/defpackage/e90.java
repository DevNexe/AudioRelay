package defpackage;

import com.facebook.ads.AdError;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class e90 {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public static final class QnHx {
        /* JADX WARN: Code duplicated, block: B:32:0x0041  */
        public static int a(int i, int i2, String str, boolean z) {
            boolean z2;
            while (i < i2) {
                int i3 = i + 1;
                char cCharAt = str.charAt(i);
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127) {
                    if (!(cCharAt <= '9' && '0' <= cCharAt)) {
                        if (!(cCharAt <= 'z' && 'a' <= cCharAt)) {
                            z2 = (cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':';
                        }
                    }
                }
                if (z2 == (!z)) {
                    return i;
                }
                i = i3;
            }
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0082  */
        public static long b(int i, String str) {
            int iA = a(0, i, str, false);
            Matcher matcher = e90.m.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int iF = -1;
            int i5 = -1;
            int i6 = -1;
            while (iA < i) {
                int iA2 = a(iA + 1, i, str, true);
                matcher.region(iA, iA2);
                if (i3 == -1 && matcher.usePattern(e90.m).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                    i5 = Integer.parseInt(matcher.group(2));
                    i6 = Integer.parseInt(matcher.group(3));
                } else if (i4 == -1 && matcher.usePattern(e90.l).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                } else if (iF == -1) {
                    Pattern pattern = e90.k;
                    if (matcher.usePattern(pattern).matches()) {
                        iF = mv4.F(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                    } else if (i2 != -1 && matcher.usePattern(e90.j).matches()) {
                        i2 = Integer.parseInt(matcher.group(1));
                    }
                } else if (i2 != -1) {
                }
                iA = a(iA2 + 1, i, str, false);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += AdError.SERVER_ERROR_CODE;
            }
            if (!(i2 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iF != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i4 && i4 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i3 >= 0 && i3 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i5 >= 0 && i5 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i6 >= 0 && i6 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(qf5.d);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, iF - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i5);
            gregorianCalendar.set(13, i6);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public e90(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e90) {
            e90 e90Var = (e90) obj;
            if (ur1.a(e90Var.a, this.a) && ur1.a(e90Var.b, this.b) && e90Var.c == this.c && ur1.a(e90Var.d, this.d) && ur1.a(e90Var.e, this.e) && e90Var.f == this.f && e90Var.g == this.g && e90Var.h == this.h && e90Var.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = bl2.a(this.b, bl2.a(this.a, 527, 31), 31);
        long j2 = this.c;
        return ((((((bl2.a(this.e, bl2.a(this.d, (iA + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31), 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(gf0.a.get().format(new Date(j2)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
