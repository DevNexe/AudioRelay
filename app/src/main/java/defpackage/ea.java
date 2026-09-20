package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class ea {
    public static final String d;
    public static final String e;
    public static final ea f;
    public static final ea g;
    public final boolean a;
    public final int b;
    public final e25 c;

    public static class QnHx {
        public static final byte[] e = new byte[1792];
        public final CharSequence a;
        public final int b;
        public int c;
        public char d;

        static {
            for (int i = 0; i < 1792; i++) {
                e[i] = Character.getDirectionality(i);
            }
        }

        public QnHx(CharSequence charSequence) {
            this.a = charSequence;
            this.b = charSequence.length();
        }

        public final byte a() {
            int i = this.c - 1;
            CharSequence charSequence = this.a;
            char cCharAt = charSequence.charAt(i);
            this.d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.c);
                this.c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.c--;
            char c = this.d;
            return c < 1792 ? e[c] : Character.getDirectionality(c);
        }
    }

    static {
        f25.LPt8Fixed lPt8 = f25.c;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        f = new ea(false, 2, lPt8);
        g = new ea(true, 2, lPt8);
    }

    public ea(boolean z, int i, f25.LPt8Fixed lPt8) {
        this.a = z;
        this.b = i;
        this.c = lPt8;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        QnHx qnHx = new QnHx(charSequence);
        qnHx.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = qnHx.c;
            if (i4 < qnHx.b && i == 0) {
                CharSequence charSequence2 = qnHx.a;
                char cCharAt = charSequence2.charAt(i4);
                qnHx.d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, qnHx.c);
                    qnHx.c = Character.charCount(iCodePointAt) + qnHx.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    qnHx.c++;
                    char c = qnHx.d;
                    directionality = c < 1792 ? QnHx.e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (qnHx.c > 0) {
            switch (qnHx.a()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    i3--;
                    break;
                case 16:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    i3--;
                    break;
                case 18:
                    i3++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        QnHx qnHx = new QnHx(charSequence);
        qnHx.c = qnHx.b;
        int i = 0;
        int i2 = 0;
        while (qnHx.c > 0) {
            byte bA = qnHx.a();
            if (bA == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bA == 1 || bA == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bA != 9) {
                switch (bA) {
                    case 14:
                    case 15:
                        if (i2 == i) {
                            return -1;
                        }
                        i--;
                        break;
                    case 16:
                    case 17:
                        if (i2 == i) {
                            return 1;
                        }
                        i--;
                        break;
                    case 18:
                        i++;
                        break;
                    default:
                        if (i2 == 0) {
                            i2 = i;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence, e25 e25Var) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zB = ((f25.F1) e25Var).b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = (this.b & 2) != 0;
        String str2 = e;
        String str3 = d;
        boolean z2 = this.a;
        if (z) {
            boolean zB2 = (zB ? f25.b : f25.a).b(charSequence.length(), charSequence);
            if (z2 || !(zB2 || a(charSequence) == 1)) {
                str = (!z2 || (zB2 && a(charSequence) != -1)) ? "" : str2;
            } else {
                str = str3;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zB != z2) {
            spannableStringBuilder.append(zB ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zB3 = (zB ? f25.b : f25.a).b(charSequence.length(), charSequence);
        if (!z2 && (zB3 || b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z2 || (zB3 && b(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
