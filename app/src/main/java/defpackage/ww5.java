package defpackage;

import android.os.Bundle;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ww5 {
    public static final ww5 b = new ww5(null, null);
    public final EnumMap a;

    public ww5(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(hw5.class);
        this.a = enumMap;
        enumMap.put(hw5.AD_STORAGE, bool);
        enumMap.put(hw5.ANALYTICS_STORAGE, bool2);
    }

    public static ww5 a(Bundle bundle) {
        if (bundle == null) {
            return b;
        }
        EnumMap enumMap = new EnumMap(hw5.class);
        for (hw5 hw5Var : hw5.values()) {
            String string = bundle.getString(hw5Var.w);
            Boolean bool = null;
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
            }
            enumMap.put(hw5Var, bool);
        }
        return new ww5(enumMap);
    }

    public static ww5 b(String str) {
        EnumMap enumMap = new EnumMap(hw5.class);
        if (str != null) {
            for (int i = 0; i < 2; i++) {
                hw5 hw5Var = hw5.z[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char cCharAt = str.charAt(i2);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(hw5Var, bool);
                }
            }
        }
        return new ww5(enumMap);
    }

    public final ww5 c(ww5 ww5Var) {
        EnumMap enumMap = new EnumMap(hw5.class);
        for (hw5 hw5Var : hw5.values()) {
            Boolean boolValueOf = (Boolean) this.a.get(hw5Var);
            Boolean bool = (Boolean) ww5Var.a.get(hw5Var);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(hw5Var, boolValueOf);
        }
        return new ww5(enumMap);
    }

    public final ww5 d(ww5 ww5Var) {
        EnumMap enumMap = new EnumMap(hw5.class);
        for (hw5 hw5Var : hw5.values()) {
            Boolean bool = (Boolean) this.a.get(hw5Var);
            if (bool == null) {
                bool = (Boolean) ww5Var.a.get(hw5Var);
            }
            enumMap.put(hw5Var, bool);
        }
        return new ww5(enumMap);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("G1");
        hw5[] hw5VarArr = hw5.z;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.a.get(hw5VarArr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        char c;
        if (!(obj instanceof ww5)) {
            return false;
        }
        ww5 ww5Var = (ww5) obj;
        hw5[] hw5VarArrValues = hw5.values();
        int length = hw5VarArrValues.length;
        int i = 0;
        while (true) {
            char c2 = 1;
            if (i >= length) {
                return true;
            }
            hw5 hw5Var = hw5VarArrValues[i];
            Boolean bool = (Boolean) this.a.get(hw5Var);
            if (bool == null) {
                c = 0;
            } else {
                c = bool.booleanValue() ? (char) 1 : (char) 2;
            }
            Boolean bool2 = (Boolean) ww5Var.a.get(hw5Var);
            if (bool2 == null) {
                c2 = 0;
            } else if (!bool2.booleanValue()) {
                c2 = 2;
            }
            if (c != c2) {
                return false;
            }
            i++;
        }
    }

    public final boolean f(hw5 hw5Var) {
        Boolean bool = (Boolean) this.a.get(hw5Var);
        return bool == null || bool.booleanValue();
    }

    public final boolean g(ww5 ww5Var, hw5... hw5VarArr) {
        for (hw5 hw5Var : hw5VarArr) {
            Boolean bool = (Boolean) this.a.get(hw5Var);
            Boolean bool2 = (Boolean) ww5Var.a.get(hw5Var);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean bool : this.a.values()) {
            i = (i * 31) + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        hw5[] hw5VarArrValues = hw5.values();
        int length = hw5VarArrValues.length;
        for (int i = 0; i < length; i++) {
            hw5 hw5Var = hw5VarArrValues[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(hw5Var.name());
            sb.append("=");
            Boolean bool = (Boolean) this.a.get(hw5Var);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public ww5(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(hw5.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
