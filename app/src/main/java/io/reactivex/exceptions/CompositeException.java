package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CompositeException extends RuntimeException {
    public final List<Throwable> w;
    public final String x;
    public QnHx y;

    public static abstract class CQf {
        public abstract void a(String str);
    }

    public static final class F1 extends CQf {
        public final PrintStream a;

        public F1(PrintStream printStream) {
            this.a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.CQf
        public final void a(String str) {
            this.a.println((Object) str);
        }
    }

    public static final class LPt8Fixed extends CQf {
        public final PrintWriter a;

        public LPt8Fixed(PrintWriter printWriter) {
            this.a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.CQf
        public final void a(String str) {
            this.a.println((Object) str);
        }
    }

    public static final class QnHx extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    public final void b(CQf cQf) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.w) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        cQf.a(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        if (this.y == null) {
            QnHx qnHx = new QnHx();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.w.iterator();
            QnHx qnHx2 = qnHx;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    ArrayList<Throwable> arrayList = new ArrayList();
                    Throwable cause = next.getCause();
                    if (cause != null && cause != next) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    for (Throwable th : arrayList) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        qnHx2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = qnHx2.getCause();
                    if (cause3 != null && qnHx2 != cause3) {
                        do {
                            qnHx2 = cause3;
                            cause3 = qnHx2.getCause();
                            if (cause3 == null) {
                                break;
                            }
                        } while (cause3 != qnHx2);
                    }
                }
            }
            this.y = qnHx;
        }
        return this.y;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.x;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new F1(printStream));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).w);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.w = listUnmodifiableList;
            this.x = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new LPt8Fixed(printWriter));
    }
}
