package org.gephi.preview.api.controller;

import org.gephi.preview.api.Graph;
import org.gephi.preview.api.supervisor.EdgeSupervisor;
import org.gephi.preview.api.supervisor.GlobalEdgeSupervisor;
import org.gephi.preview.api.supervisor.NodeSupervisor;
import org.gephi.preview.api.supervisor.SelfLoopSupervisor;

/**
 * Interface of the preview controller.
 *
 * @author Jérémy Subtil <jeremy.subtil@gephi.org>
 */
public interface PreviewController {

    /**
     * Returns the current preview graph.
     * 
     * @return the current preview graph
     */
    public Graph getGraph();

    /**
     * Retreives the workspace graph and builds a preview graph from it.
     */
    public void buildGraph();

    /**
     * Returns the node supervisor.
     *
     * @return the controller's node supervisor
     */
    public NodeSupervisor getNodeSupervisor();

    /**
     * Returns the global edge supervisor.
     *
     * @return the controller's global edge supervisor
     */
    public GlobalEdgeSupervisor getGlobalEdgeSupervisor();

    /**
     * Returns the self-loop supervisor.
     *
     * @return the controller's self-loop supervisor
     */
    public SelfLoopSupervisor getSelfLoopSupervisor();

    /**
     * Returns the unidirectional edge supervisor.
     *
     * @return the controller's unidirectional edge supervisor
     */
    public EdgeSupervisor getUniEdgeSupervisor();

    /**
     * Returns the bidirectional edge supervisor.
     *
     * @return the controller's bidirectional edge supervisor
     */
    public EdgeSupervisor getBiEdgeSupervisor();
}
