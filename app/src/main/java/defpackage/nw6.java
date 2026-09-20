package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class nw6 {
    public static double a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return Math.floor(Math.abs(d)) * ((double) (d > 0.0d ? 1 : -1));
    }

    public static int b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d)) * ((double) (d > 0.0d ? 1 : -1))) % 4.294967296E9d);
    }

    public static void c(ma5 ma5Var) {
        int iB = b(ma5Var.d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (iB > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        ma5Var.h("runtime.counter", new gw5(Double.valueOf(iB)));
    }

    public static long d(double d) {
        return ((long) b(d)) & 4294967295L;
    }

    public static u46 e(String str) {
        u46 u46Var = (str == null || str.isEmpty()) ? null : (u46) u46.H0.get(Integer.valueOf(Integer.parseInt(str)));
        if (u46Var != null) {
            return u46Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(ez5 ez5Var) {
        if (ez5.p.equals(ez5Var)) {
            return null;
        }
        if (ez5.o.equals(ez5Var)) {
            return "";
        }
        if (ez5Var instanceof hy5) {
            return g((hy5) ez5Var);
        }
        if (!(ez5Var instanceof hu5)) {
            return !ez5Var.zzh().isNaN() ? ez5Var.zzh() : ez5Var.zzi();
        }
        ArrayList arrayList = new ArrayList();
        hu5 hu5Var = (hu5) ez5Var;
        hu5Var.getClass();
        int i = 0;
        while (true) {
            if (!(i < hu5Var.d())) {
                return arrayList;
            }
            if (i >= hu5Var.d()) {
                throw new NoSuchElementException(GM.a("Out of bounds index: ", i));
            }
            int i2 = i + 1;
            Object objF = f(hu5Var.e(i));
            if (objF != null) {
                arrayList.add(objF);
            }
            i = i2;
        }
    }

    public static HashMap g(hy5 hy5Var) {
        HashMap map = new HashMap();
        hy5Var.getClass();
        for (String str : new ArrayList(hy5Var.w.keySet())) {
            Object objF = f(hy5Var.zzf(str));
            if (objF != null) {
                map.put(str, objF);
            }
        }
        return map;
    }

    public static void h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i, ArrayList arrayList) {
        if (arrayList.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(arrayList.size())));
        }
    }

    public static boolean k(ez5 ez5Var) {
        if (ez5Var == null) {
            return false;
        }
        Double dZzh = ez5Var.zzh();
        return !dZzh.isNaN() && dZzh.doubleValue() >= 0.0d && dZzh.equals(Double.valueOf(Math.floor(dZzh.doubleValue())));
    }

    public static boolean l(ez5 ez5Var, ez5 ez5Var2) {
        if (!ez5Var.getClass().equals(ez5Var2.getClass())) {
            return false;
        }
        if ((ez5Var instanceof n06) || (ez5Var instanceof oy5)) {
            return true;
        }
        if (ez5Var instanceof gw5) {
            if (Double.isNaN(ez5Var.zzh().doubleValue()) || Double.isNaN(ez5Var2.zzh().doubleValue())) {
                return false;
            }
            return ez5Var.zzh().equals(ez5Var2.zzh());
        }
        if (ez5Var instanceof f06) {
            return ez5Var.zzi().equals(ez5Var2.zzi());
        }
        if (ez5Var instanceof av5) {
            return ez5Var.zzg().equals(ez5Var2.zzg());
        }
        return ez5Var == ez5Var2;
    }
}
