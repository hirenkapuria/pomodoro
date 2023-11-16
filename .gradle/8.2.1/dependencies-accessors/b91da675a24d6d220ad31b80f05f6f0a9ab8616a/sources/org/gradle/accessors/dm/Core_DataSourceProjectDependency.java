package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class Core_DataSourceProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Core_DataSourceProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":core:data-source:api"
     */
    public Core_DataSource_ApiProjectDependency getApi() { return new Core_DataSource_ApiProjectDependency(getFactory(), create(":core:data-source:api")); }

    /**
     * Creates a project dependency on the project at path ":core:data-source:impl"
     */
    public Core_DataSource_ImplProjectDependency getImpl() { return new Core_DataSource_ImplProjectDependency(getFactory(), create(":core:data-source:impl")); }

}
