package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kc1 {
    public final String a;
    public final List<jc1> b;

    public kc1(String str, List<jc1> list) {
        this.a = str;
        this.b = list;
    }

    public final String a(String str) {
        List<jc1> list = this.b;
        int iJ = ps0.J(list);
        if (iJ < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            jc1 jc1Var = list.get(i);
            if (iv4.r(jc1Var.a, str)) {
                return jc1Var.b;
            }
            if (i == iJ) {
                return null;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    public final String toString() {
        boolean z;
        List<jc1> list = this.b;
        boolean zIsEmpty = list.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        int length = str.length();
        int length2 = 0;
        for (jc1 jc1Var : list) {
            length2 += jc1Var.b.length() + jc1Var.a.length() + 3;
        }
        StringBuilder sb = new StringBuilder(length + length2);
        sb.append(str);
        int iJ = ps0.J(list);
        if (iJ >= 0) {
            int i = 0;
            while (true) {
                jc1 jc1Var2 = list.get(i);
                sb.append("; ");
                sb.append(jc1Var2.a);
                sb.append("=");
                Set<Character> set = lc1.a;
                String str2 = jc1Var2.b;
                boolean z2 = true;
                if (!(str2.length() == 0)) {
                    if (str2.length() >= 2) {
                        if (str2.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        if (str2.charAt(0) != '\"') {
                            z = false;
                        } else {
                            if (str2.length() == 0) {
                                throw new NoSuchElementException("Char sequence is empty.");
                            }
                            if (str2.charAt(mv4.B(str2)) != '\"') {
                                z = false;
                            } else {
                                int i2 = 1;
                                while (true) {
                                    int iE = mv4.E(str2, '\"', i2, false, 4);
                                    if (iE != mv4.B(str2)) {
                                        int i3 = 0;
                                        for (int i4 = iE - 1; str2.charAt(i4) == '\\'; i4--) {
                                            i3++;
                                        }
                                        if (i3 % 2 == 0) {
                                            z = false;
                                        } else {
                                            i2 = iE + 1;
                                            if (i2 >= str2.length()) {
                                            }
                                        }
                                    }
                                    z = true;
                                }
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = false;
                        break;
                    }
                    int length3 = str2.length();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length3) {
                            z2 = false;
                            break;
                        }
                        if (lc1.a.contains(Character.valueOf(str2.charAt(i5)))) {
                            break;
                        }
                        i5++;
                    }
                }
                if (z2) {
                    StringBuilder sb2 = new StringBuilder("\"");
                    int length4 = str2.length();
                    for (int i6 = 0; i6 < length4; i6++) {
                        char cCharAt = str2.charAt(i6);
                        if (cCharAt == '\\') {
                            sb2.append("\\\\");
                        } else if (cCharAt == '\n') {
                            sb2.append("\\n");
                        } else if (cCharAt == '\r') {
                            sb2.append("\\r");
                        } else if (cCharAt == '\t') {
                            sb2.append("\\t");
                        } else if (cCharAt == '\"') {
                            sb2.append("\\\"");
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    sb2.append("\"");
                    sb.append(sb2.toString());
                } else {
                    sb.append(str2);
                }
                if (i != iJ) {
                    i++;
                }
            }
        }
        return sb.toString();
    }
}
